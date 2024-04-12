// Clase Account y sus atributos y métodos
class Account {
    Integer id;
    String driver;
    String name;
    String document;
    String email;
    String password;

    public Account(String name, String document) {
        this.name = name;
        this.document = document;
    }

    void printDataAccount() {
        System.out.println("Nombre: " + name + " Email: " + email);
    }
}
