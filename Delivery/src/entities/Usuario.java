package entities;

public class Usuario {
    int id;
    String name;
    String password;
    int coordenadaX;
    int coordenadaY;

    //............................................................................
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //............................................................................
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //............................................................................
    public int[] getAddress() {
        return new int[] {coordenadaX,coordenadaY};
    }

    public void setAddress(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    //............................................................................
    public Usuario(int id, String name, int coordenadaX, int coordenadaY) {
        this.id = id;
        this.name = name;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }


}
