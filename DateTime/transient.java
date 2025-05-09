import java.io.*;

class User implements Serializable {
    private String username;
    private transient String password; // This field will not be serialized

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Password: " + password;
    }
}

 class TransientExample {
    public static void main(String[] args) {
        User user = new User("john_doe", "secret123");

        // Serialize the user object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the user object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {
            User deserializedUser = (User) ois.readObject();
            System.out.println("Deserialized User: " + deserializedUser);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
