# 📝 Employee Payroll System - Java Console Application 🚀  

![Java](https://img.shields.io/badge/Java-17%2B-blue)  
*A simple console-based payroll system to manage employees (Full-time & Part-time).*  

---

## 📌 **Features**  

✅ **Add Employees** (Full-time or Part-time)  
✅ **Remove Employees** by ID  
✅ **Display All Employees** with details  
✅ **Interactive Console Menu**  
✅ **Object-Oriented Design** (Abstraction, Inheritance)  

---

## 🛠 **How to Run**  

1. **Prerequisites**  
   - Install [Java JDK 17+](https://www.oracle.com/java/technologies/javase-downloads.html)  
   - A terminal or IDE (VS Code, IntelliJ, Eclipse)  

2. **Compile & Execute**  
   ```sh
   javac Main.java
   java Main
   ```

---

## 🖥 **Usage**  

### **Main Menu**  
```
Payroll System Menu:
1. Add Employee
2. Remove Employee
3. Display All Employees
4. Exit
Enter your choice: 
```

### **1️⃣ Add Employee**  
- Choose between **Full-time** or **Part-time**  
- Enter:  
  - Name  
  - ID  
  - **Salary (Full-time)** / **Hours & Rate (Part-time)**  

### **2️⃣ Remove Employee**  
- Enter the **Employee ID** to remove  
- Shows success/error message  

### **3️⃣ Display All Employees**  
- Lists all employees with details (Name, ID, Salary)  

### **4️⃣ Exit**  
- Closes the program  

---

## 🏗 **Code Structure**  

### **Classes Overview**  

| Class | Description |
|-------|------------|
| `Employee` (Abstract) | Base class with `name`, `id`, and `CalculateSalary()` |
| `FullTimeEmployee` | Extends `Employee` → Uses **monthly salary** |
| `PartTimeEmployee` | Extends `Employee` → Uses **hourly wage** |
| `PayRollSystem` | Manages employee list (Add/Remove/Display) |
| `Main` | Runs the console menu |

---

## 📊 **Example Output**  

### **Adding an Employee**  
```
Add Employee:
1. Full-time Employee
2. Part-time Employee
Enter employee type: 1
Enter employee name: John Doe
Enter employee ID: 101
Enter monthly salary: 5000
Full-time employee added successfully.
```

### **Displaying Employees**  
```
Current Employees:
Employee [name=John Doe, Id=101, Salary=5000.0]
Employee [name=Jane Smith, Id=102, Salary=2000.0]
```

### **Removing an Employee**  
```
Enter employee ID to remove: 102
Employee with ID 102 removed successfully.
```

---

## 🚀 **Future Improvements**  
🔸 Save/Load employees to a file (JSON/CSV)  
🔸 Edit existing employee details  
🔸 Calculate taxes & deductions  
🔸 GUI version (JavaFX/Swing)  

---

## 🤝 **Contributing**  
Feel free to fork & submit PRs!  

---

## 📜 **License**  
MIT © [Navnish Rajput]  

---

**🎉 Happy Coding!** 👨‍💻👩‍💻  

---



---

**⭐ Star this repo if you find it useful!** ⭐
