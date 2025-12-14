## 01.Singleton Pattern

Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.

- Only one object is created
- Same object is used everywhere

Thread safe Singleton

```
class Singleton {

    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

```

### Real world use cases of Singleton

1.  Database Connection.

```
class DBConnection {

    private static DBConnection instance;

    private DBConnection() {}

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Database connected");
    }
}

```

2.  logger system.

```
class Logger {

    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

```

## 02.Builder Pattern

The Builder pattern constructs complex objects step by step. (Step by step object creation)

- Creating User Profiles

  - Optional fields like address, phone, email

## 03.Factory Pattern

The Factory pattern provides an interface for creating objects, but lets subclasses decide which object to create.

- Payment Systems
- Notification Systems
