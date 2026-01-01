# Notification System (Java – OOP)

## Overview
A simple Java project demonstrating core Object-Oriented Programming (OOP)
concepts using a notification system.

The system supports sending notifications through multiple channels
such as Email, SMS, and WhatsApp.

---

## Features
- Multiple notification channels
- Common base service for all notifications
- Runtime polymorphism for dynamic behavior

---

## OOP Concepts Used
- Abstraction
- Inheritance
- Polymorphism

---

## Project Structure
```text
src/
└── notification/
    ├── NotificationService.java
    ├── Email.java
    ├── SMS.java
    ├── WhatsApp.java
    └── User.java
```
---

## How It Works
- `NotificationService` acts as the base class
- Channel-specific classes extend the base service
- `User` triggers notifications using polymorphism

---

## Technologies Used
- Java
- IntelliJ IDEA
- Git & GitHub

---

## Purpose
Created to practice and strengthen core Java OOP fundamentals.
