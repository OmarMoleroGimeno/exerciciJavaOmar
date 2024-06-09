package UD08._09_supermercado;

import java.time.LocalDate;

public interface esAlimento{

    public void setCaducidad(LocalDate fc);
    public LocalDate getCaducidad();
    public int getCalorias();

}
