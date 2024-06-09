package UD09.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import UD09.DAO.comentario.Comentario;
import UD09.DAO.comentario.CommentsRepositoryImpl;
import UD09.DAO.post.Post;
import UD09.DAO.post.PostRepositoryImpl;
import UD09.DAO.user.Usuario;
import UD09.DAO.user.UsuarioRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        IRepository<Usuario> usuarioDAO = new UsuarioRepositoryImpl();
        PostRepositoryImpl postDAO = new PostRepositoryImpl();
        CommentsRepositoryImpl comentarioDAO = new CommentsRepositoryImpl();

        try (Connection con = DbConnect.getInstance().getConnection()) {
            while (true) {
                menuPrincipal();
                int opcion = entrada.nextInt();
                entrada.nextLine(); // Limpiar el buffer del entrada

                switch (opcion) {
                    case 1:
                        gestionarUsuarios(entrada, usuarioDAO);
                        break;
                    case 2:
                        gestionarPosts(entrada, postDAO);
                        break;
                    case 3:
                        gestionarComentarios(entrada, comentarioDAO);
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        entrada.close();
                        System.exit(0);
                    default:
                        System.out.println("Opción inválida. Intenta de nuevo.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la conexión con la base de datos: " + e.getMessage());
        }
    }

    private static void gestionarUsuarios(Scanner entrada, IRepository<Usuario> usuarioDAO) {
        while (true) {
            menuUsuarios();
            int opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer del entrada

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del usuario: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Introduce el apellido del usuario: ");
                    String apellido = entrada.nextLine();
                    Usuario nuevoUsuario = new Usuario(0, nombre, apellido); // El ID se genera automáticamente
                    try {
                        usuarioDAO.crear(nuevoUsuario);
                        System.out.println("Usuario creado con ID: " + nuevoUsuario.getId());
                    } catch (SQLException e) {
                        System.out.println("Error al crear usuario: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Introduce el ID del usuario a consultar: ");
                    int idUsuario = entrada.nextInt();
                    entrada.nextLine(); // Limpiar el buffer del entrada
                    try {
                        Usuario usuario = usuarioDAO.obtener(idUsuario);
                        if (usuario != null) {
                            System.out.println("Usuario encontrado:");
                            System.out.printf(" %-3d %-15s %-15s%n",
                                                usuario.getId(),
                                                usuario.getNombre(),
                                                usuario.getApellido());
                        } else {
                            System.out.println("No se encontró ningún usuario con ese ID.");
                        }
                    } catch (SQLException e) {
                        System.out.println("Error al obtener usuario: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        ArrayList<Usuario> usuarios = usuarioDAO.obtenerTodos();
                        if (!usuarios.isEmpty()) {
                            System.out.println("Listado de Usuarios:");
                            for (Usuario u : usuarios) {
                                System.out.println("ID: " + u.getId() + ", Nombre: " + u.getNombre() + ", Apellido: " + u.getApellido());
                            }
                        } else {
                            System.out.println("No hay usuarios registrados.");
                        }
                    } catch (SQLException e) {
                        System.out.println("Error al obtener todos los usuarios: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Introduce el ID del usuario a actualizar: ");
                    int idActualizar = entrada.nextInt();
                    entrada.nextLine(); // Limpiar el buffer del entrada
                    try {
                        Usuario usuarioActualizar = usuarioDAO.obtener(idActualizar);
                        if (usuarioActualizar != null) {
                            System.out.print("Introduce el nuevo nombre del usuario (deja en blanco para mantener el actual): ");
                            String nuevoNombre = entrada.nextLine();
                            if (!nuevoNombre.isEmpty()) {
                                usuarioActualizar.setNombre(nuevoNombre);
                            }

                            System.out.print("Introduce el nuevo apellido del usuario (deja en blanco para mantener el actual): ");
                            String nuevoApellido = entrada.nextLine();
                            if (!nuevoApellido.isEmpty()) {
                                usuarioActualizar.setApellido(nuevoApellido);
                            }
                            usuarioDAO.actualizar(usuarioActualizar);
                            System.out.println("Usuario actualizado correctamente.");
                        } else {
                            System.out.println("No se encontró ningún usuario con ese ID.");
                        }
                    } catch (SQLException e) {
                        System.out.println("Error al actualizar usuario: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Introduce el ID del usuario a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine(); // Limpiar el buffer del entrada
                    try {
                        Usuario usuarioActualizar = usuarioDAO.obtener(idEliminar);
                        if (usuarioActualizar != null) {
                            // eliminar primero los comentarios y posts asociados al usuario
                            PostRepositoryImpl.eliminarPostsUsuario(idEliminar);
                            // luego eliminar el usuario
                            usuarioDAO.eliminar(idEliminar);
                            System.out.println("Usuario eliminado correctamente.");
                        } else {
                            System.out.println("No se encontró ningún usuario con ese ID.");
                        }
                    } catch (SQLException e) {
                        System.out.println("Error al eliminar usuario: " + e.getMessage());
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }

    private static void gestionarPosts(Scanner entrada, PostRepositoryImpl postDAO) {
        while (true) {
            menuPosts();
            int opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer del entrada

            switch (opcion) {
                //1. Crear Post
                case 1:
                    System.out.print("Introduce el texto del post: ");
                    String texto = entrada.nextLine();

                    UsuarioRepositoryImpl usuarioRepository = new UsuarioRepositoryImpl();
                    ArrayList<Usuario> usuarios;
                    int postId = 0;
                    try {
                        usuarios = usuarioRepository.obtenerTodos();
                        for (Usuario usuario : usuarios) {
                            System.out.println(usuario.toString());
                        }
                        System.out.print("Introduce el ID del usuario que publica el post:  ");
                        postId = entrada.nextInt();
                    } catch (SQLException e) {
                        System.out.println("ERROR: " + e.getMessage());
                    }

                    Post nuevoPost = new Post(0, postId, 0, LocalDate.now().toString(), texto); // El ID se genera automáticamente
                    try {
                        postDAO.crear(nuevoPost);
                        System.out.println("Post creado con ID: " + nuevoPost.getId());
                    } catch (SQLException e) {
                        System.out.println("Error al crear post: " + e.getMessage());
                    }
                    break;
                //2. Consultar post por ID
                case 2:
                    PostRepositoryImpl postRepository = new PostRepositoryImpl();
                    postRepository = new PostRepositoryImpl();
                    System.out.print("Introduce el ID del post:  ");
                    postId = entrada.nextInt();

                    try {
                        System.out.println(postRepository.obtener(postId).toString());
                    } catch (SQLException e) {
                        System.out.println("ERROR: " + e.getMessage());
                    }
                    
                    break;
                //3. Listar todos los posts
                case 3:
                    ArrayList<Post> posts;
                    postRepository = new PostRepositoryImpl();
                    try {
                        posts = postRepository.obtenerTodos();
                        for (Post post : posts) {
                            System.out.println(post.toString());
                        }
                    } catch (SQLException e) {
                        System.out.println("ERROR: " + e.getMessage());
                    }
                    break;
                //4. Actualizar post
                case 4:
                    try {
                        postRepository = new PostRepositoryImpl();
                        posts = postRepository.obtenerTodos();
                        for (Post post : posts) {
                            System.out.println(post.toString());
                        }

                        System.out.print("Introduce el ID del post a actualizar: ");
                        int idActualizar = entrada.nextInt();
                        entrada.nextLine(); // Limpiar el buffer del entrada
    
                        //Pedir el dato a actualizar
                        System.out.print("Introduce el texto que vas a actualizar: ");
                        String textoActualizar = entrada.nextLine();

                        Post postActualizar = postDAO.obtener(idActualizar);
                        postActualizar.setText(textoActualizar);
                        postRepository.actualizar(postActualizar);
                    } catch (SQLException e) {
                        System.out.println("Error al actualizar usuario: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        postRepository = new PostRepositoryImpl();
                        posts = postRepository.obtenerTodos();
                        for (Post post : posts) {
                            System.out.println(post.toString());
                        }

                        System.out.print("Introduce el id del post a eliminar: ");
                        int idEliminar = entrada.nextInt();

                        Post postActualizar = postDAO.obtener(idEliminar);

                        if (postActualizar != null) {
                            postRepository.eliminar(idEliminar);
                            System.out.println("El post con id " + idEliminar + " se ha eliminado correctamente.");
                        } else {
                            System.out.println("No existe el post con este id " + idEliminar);
                        }

                        
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }

    private static void gestionarComentarios(Scanner entrada, CommentsRepositoryImpl commDAO) {
        while (true) {
            menuComentarios();
            int opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer del entrada
            CommentsRepositoryImpl comments = new CommentsRepositoryImpl();
            Comentario comm = null;
            switch (opcion) {
                //1. Crear comentario
                case 1:
                    System.out.print("Introduce el id del usuario: ");
                    int userID = entrada.nextInt();
                    System.out.print("Introduce el id del post: ");
                    int postID = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Introduce el texto: ");
                    String text = entrada.nextLine();

                    Comentario com = new Comentario(0, userID, postID, text, LocalDate.now().toString());
                    try {
                        comments.crear(com);
                    } catch (SQLException e) {
                        System.out.println("Error " + e.getMessage());
                    }
                    
                    break;
                //2. Consultar comentario por ID
                case 2:
                    try {
                        System.out.print("Introduce el ID del comentario a consultar: ");
                        int id = entrada.nextInt();
                        comm = comments.obtener(id);
                        System.out.println(comm.toString());
                    } catch (SQLException e) {
                        System.out.println("Error " + e.getMessage());
                    }
                    break;
                //3. Listar todos los comentarios
                case 3:
                    try {
                        ArrayList<Comentario> todosLosComentarios = comments.obtenerTodos();
                        for (Comentario comentario : todosLosComentarios) {
                            System.out.println(comentario.toString());
                        }
                    } catch (SQLException e) {
                        System.out.println("Error " + e.getMessage());
                    }

                //4. Actualizar comentario
                case 4:
                    try {
                        ArrayList<Comentario> todosLosComentarios = comments.obtenerTodos();
                        for (Comentario comentario : todosLosComentarios) {
                            System.out.println(comentario.toString());
                        }
                        System.out.print("Introduce el id del comentario a actualizar: ");
                        int idActualizar = entrada.nextInt();

                        Comentario commActualizar = commDAO.obtener(idActualizar);
                        if (commActualizar != null) {
                            System.out.print("Introduce en nuevo texto: ");
                            String textoActualizar = entrada.nextLine();
                            comm = new Comentario(idActualizar, commActualizar.getUserId(), commActualizar.getPostId(), textoActualizar, LocalDate.now().toString());
                            comments.actualizar(comm);
                        } else {
                            System.out.println("No existe ese comentario.");
                        }
                    } catch (SQLException e) {
                        System.out.println("Error " + e.getMessage());
                    }
                    break;
                //5. Eliminar comentario
                case 5:
                try {
                    ArrayList<Comentario> todosLosComentarios = comments.obtenerTodos();
                    for (Comentario comentario : todosLosComentarios) {
                        System.out.println(comentario.toString());
                    }
                    System.out.print("Introduce el id del comentario a actualizar: ");
                    int idActualizar = entrada.nextInt();
                    comments.eliminar(idActualizar);
                } catch (SQLException e) {
                    System.out.println("Error " + e.getMessage());
                }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }

    // MENÚ PRINCIPAL: menuPrincipal()
    private static void menuPrincipal() {
        System.out.println("\nMenú Principal:");
        System.out.println("1. Gestionar Usuarios");
        System.out.println("2. Gestionar Posts");
        System.out.println("3. Gestionar Comentarios");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción:  ");
    }

    // MENÚ SECUNDARIO: menuUsuarios()
    private static void menuUsuarios() {
        System.out.println("\nMenú de Usuarios:");
        System.out.println("1. Crear usuario");
        System.out.println("2. Consultar usuario por ID");
        System.out.println("3. Listar todos los usuarios");
        System.out.println("4. Actualizar usuario");
        System.out.println("5. Eliminar usuario");
        System.out.println("0. Volver al menú principal");
        System.out.print("Selecciona una opción:  ");
    }

    // MENÚ SECUNDARIO: menuPosts()
    private static void menuPosts() {
        System.out.println("\nMenú de Posts:");
        System.out.println("1. Crear post");
        System.out.println("2. Consultar post por ID");
        System.out.println("3. Listar todos los posts");
        System.out.println("4. Actualizar post");
        System.out.println("5. Eliminar post");
        System.out.println("0. Volver al menú principal");
        System.out.print("Selecciona una opción:  ");
    }

    // MENÚ SECUNDARIO: menuPosts()
    private static void menuComentarios() {
        System.out.println("\nMenú de Comentarios:");
        System.out.println("1. Crear comentario");
        System.out.println("2. Consultar comentario por ID");
        System.out.println("3. Listar todos los comentarios");
        System.out.println("4. Actualizar comentario");
        System.out.println("5. Eliminar comentario");
        System.out.println("0. Volver al menú principal");
        System.out.print("Selecciona una opción:  ");
    }

}