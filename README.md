# Hotel Management System (CCP Project)

## Project Overview
This project is a Java-based implementation of a Hotel Management System based on the provided UML Structural Design Model. It manages hotels, rooms, guests, and reservations while adhering to strict Object-Oriented Design Principles.

### Key Technical Features:
* **Clean Code Practices:** Meaningful naming, modular design, and focused methods.
* **Defensive Programming:** Robust input validation (null checks, date logic, and range validation) to prevent illegal object states.
* **AAA Testing Pattern:** Includes Unit Tests following the Arrange-Act-Assert pattern to validate core logic.

## Project Structure
* `src/com/hotel`: Contains all domain classes (Hotel, Room, Reservation, etc.).
* `MainApp.java`: Entry point demonstrating the system workflow and use-cases.
* `HotelTest.java`: Unit tests for validating defensive programming logic.

## How to Run (Eclipse IDE)
1. **Import:** Import the project folder into your Eclipse Workspace.
2. **Execution:** Open `MainApp.java`, right-click and select `Run As -> Java Application`.
3. **Console:** The console will display the interaction between the HotelChain, Guests, and Reservations.

## Unit Testing
* Open `HotelTest.java`.
* Right-click and select `Run As -> Java Application`.
* The console will verify if all defensive checks (PASSED ✅) are working correctly.

## Use Case Demonstration
The `MainApp.java` demonstrates the following:
* Initializing a `HotelChain` and adding `Hotels`.
* Creating `Rooms` with specific `RoomTypes`.
* Registering a `Guest` and creating a `Reservation` with validation checks.
