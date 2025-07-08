
# 📦 Fawry Quantum Internship Challenge  Quantum Book Store

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
Quantum book store: Book added - Alice in wonderland
Quantum book store: Book added - pizza hot
Quantum book store: Book added - Exclusive
Quantum book store: Current Inventory:
 - pizza hot (E456)
 - Alice in wonderland (P153)
 - Exclusive (D789)
Quantum book store: Book not found with ISBN: P123
Quantum book store: Showcase book not for sale: D789
Quantum book store: Removed outdated book - Alice in wonderland
```

---
## 🚀 How to Run

1. Open the project in any Java IDE (like IntelliJ or Eclipse).
2. Make sure Maven is installed and configured.
3. Run the project using:
   ```bash
   mvn clean compile exec:java -Dexec.mainClass="Main"
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
**Submission for:** Fawry Rise Journey – Quantum Internship


---
