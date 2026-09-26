# Car Parking Management System

A basic console-based Car Parking Management System built with Java as a practice project while learning Object-Oriented Programming.

## Features

- Park a car in an available slot
- Automatically assign the first available parking slot
- Remove a parked car
- Search for a parked car using its car number
- Display parking slot status
- Prevent duplicate car entries
- Store basic car details:
  - Owner name
  - Contact number
  - Car number
  - Arrival time
  - Leaving time

## Technologies

- Java
- Object-Oriented Programming
- Arrays
- Scanner

## OOP Concepts Used

- Classes and Objects
- Encapsulation
- Constructors
- Private fields
- Getters and Setters
- Methods
- `this` keyword

## Project Structure

```text
src/
├── Car.java
├── ParkingSlot.java
├── ParkingManager.java
└── Main.java
```

## How to Run

Compile the program:

```bash
javac src/*.java
```

Run the program:

```bash
java -cp src Main
```

## Example

```text
==============================
    CAR PARKING MANAGEMENT
==============================
1. Park Car
2. Remove Car
3. Search Car
4. Show Parking Status
5. Exit
==============================

Enter your choice: 1

--- Park Car ---
Owner Name: Aman
Contact Number: 9876543210
Car Number: UP32AB1234
Arrival Time: 10:30 AM

Car parked successfully!
Parking Slot: 1
```

## Purpose

This project was created as a basic Java practice project to apply Object-Oriented Programming concepts to a simple real-world problem.
