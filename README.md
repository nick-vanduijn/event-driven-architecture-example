# Event-Driven Architecture Example - Java (Part of Full Stack Class)

This project is part of the Full Stack Classes and is designed to help you learn the fundamentals of **Event-Driven Architecture (EDA)** in Java. These examples demonstrate how producers, consumers, and dispatchers work together to create decoupled, modular systems.

The examples are for **educational purposes** and are not intended for full production use. They will help you understand how events are created, dispatched, and handled in real-world applications.

---

## Event-Driven Architecture (Behavioral)

Event-driven architecture is a design approach where **events** act as the primary means of communication between different parts of a system. Producers create events, dispatchers route them, and consumers handle them asynchronously.

This pattern is especially useful for building **scalable, loosely coupled systems** where components can react to changes or actions without being tightly integrated.

---

## Implementations

### Core Components

* **Event**: Represents something that happened (e.g., user registered, order placed).
* **EventDispatcher**: Routes events to the appropriate handlers.
* **Producer**: Creates and dispatches events.
* **Consumer (EventHandler)**: Subscribes to and handles specific event types.

### Usage Examples

#### 1. User Registration

* **Event**: `UserRegisteredEvent`
* **Producer**: Registration service
* **Consumer**: Sends welcome email and logs user creation

#### 2. Order Processing

* **Event**: `OrderPlacedEvent`
* **Producer**: E-commerce checkout system
* **Consumer**: Handles inventory updates, billing, and order confirmation

#### 3. Notification System

* **Event**: `NotificationEvent`
* **Producer**: Application module requesting notification
* **Consumer**: Sends SMS, email, or push notification

---

## Requirements

* Java 8+
* Maven (for build)

---

## License

MIT
