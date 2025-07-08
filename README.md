
# Quantum Book Store

A simple Java-based extensible online bookstore system that supports:

- Paper Books (shipped to an address)
- EBooks (sent via email)
- Showcase Books (not for sale)

All books support standard attributes like ISBN, title, year, price, and author. The system can:
- Add books
- Remove outdated books
- Buy books by ISBN
- Handle book-specific behavior (shipping, emailing, restricted sale)

---

## 🧠 Object-Oriented Design

- `Book`: Base class for all book types.
- `PaperBook`, `EBook`, `ShowcaseBook`: Extend `Book` with specific behavior.
- `Inventory`: Manages book operations (add, buy, remove outdated).
- `MailService` & `ShippingService`: Simulate external service calls.
- `QuantumBookstore`: Main class to test all features.

---

## 🧪 Sample Output

```
Quantum book store: Book added - Clean Code
Quantum book store: Book added - Java Concurrency
Quantum book store: Book added - Sample Preview
Quantum book store: Current Inventory:
 - Clean Code (P123)
 - Java Concurrency (E456)
 - Sample Preview (S789)
Quantum book store: Shipping 2x Clean Code to 123 Cairo Street
Quantum book store: Purchase successful. Total: 300.0
Quantum book store: Sending 1x Java Concurrency to reader@example.com
Quantum book store: Purchase successful. Total: 90.0
Quantum book store: Showcase book not for sale: S789
Quantum book store: Removed outdated book - Clean Code
Quantum book store: Removed outdated book - Sample Preview
```

---

## 🏃‍♂️ How to Run

1. Compile all `.java` files:
   ```bash
   javac *.java
   ```

2. Run the test class:
   ```bash
   java QuantumBookstoreFullTest
   ```

---

## 📂 Files Included

- `Book.java`
- `PaperBook.java`
- `EBook.java`
- `ShowcaseBook.java`
- `Inventory.java`
- `MailService.java`
- `ShippingService.java`
- `QuantumBookstoreFullTest.java`
- `README.md`

---

## 🚀 Extending the System

To add a new book type:
1. Create a new class that extends `Book`.
2. Override the `buy()` method.
3. Add it to the inventory – no other change needed.

---

## 📌 Author

**Abdelrahman Hamdy Hassan**  
Ain Shams University — Computer Science

---
