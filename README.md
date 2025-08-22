# Online Portfolio Builder

## Project Description

Craft dynamic online portfolios: Angular gathers user data, then Spring Boot renders templated HTML previews and downloadable sites, storing all content in MySQL. This full-stack web application empowers users to design and deploy personalized professional online presences efficiently.

---

##  Features

* **Form-Based User Input:** Intuitive Angular UI for entering personal details, bio, email, skills, projects, and template choice.
* **Customizable Templates:** Users can select from multiple pre-designed HTML/CSS templates.
* **Live Preview:** Instantly see how your portfolio looks with your data and selected template.
* **Downloadable Site:** Generate and download a complete static HTML/CSS portfolio as a ZIP file.
* **Data Persistence:** All user portfolio data is securely stored in a single MySQL table.
* **Responsive Design:** Generated portfolios look great on all devices (mobile, tablet, desktop).

---

## Technologies Used

**Frontend**

* Angular: Modern JavaScript framework for building the UI.
* TypeScript: Superset of JavaScript for type-safe code.
* Tailwind CSS: Utility-first CSS framework for rapid styling.
* Lucide Icons: Lightweight, customizable SVG icon library.

**Backend**

* Spring Boot: Framework for building production-ready applications.
* Spring Data JPA: Simplifies database interactions.
* Thymeleaf: Server-side template engine for dynamic HTML generation.

**Database**

* MySQL: Stores all portfolio data in a single table.

---

##  Getting Started

Follow these steps to set up and run the project locally.

### Prerequisites

* Java Development Kit (JDK) 17+
* Node.js & npm 16+
* Angular CLI: `npm install -g @angular/cli`
* Maven 3.8.x+
* MySQL Server
* Visual Studio Code (recommended IDE)

### Project Structure

```
portfolio-builder-project/
├── portfolio-backend/
└── portfolio-frontend/
```

### 1. Database Setup

1. Start your MySQL Server.
2. Open a MySQL client.
3. Execute the following SQL commands:

```sql
CREATE DATABASE IF NOT EXISTS portfolio_db;
USE portfolio_db;

CREATE TABLE IF NOT EXISTS portfolio_data (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    about TEXT,
    skills TEXT,
    projects TEXT,
    template_choice VARCHAR(50)
);
```

### 2. Backend Setup (Spring Boot)

```bash
cd portfolio-builder-project/portfolio-backend
```

* Update `src/main/resources/application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/portfolio_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=your_user
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

* Build and run:

```bash
mvn clean install
mvn spring-boot:run
```

### 3. Frontend Setup (Angular)

```bash
cd portfolio-builder-project/portfolio-frontend
npm install
```

* Configure `tailwind.config.js` content array:

```javascript
module.exports = {
  content: ["./src/**/*.{html,ts}"],
}
```

* Ensure `src/styles.scss` includes Tailwind directives:

```scss
@tailwind base;
@tailwind components;
@tailwind utilities;
```

* Run Angular server:

```bash
ng serve --open
```

###  Running the Application

1. Start backend: `mvn spring-boot:run` ([http://localhost:8080](http://localhost:8080))
2. Start frontend: `ng serve --open` ([http://localhost:4200](http://localhost:4200))

You can now interact with your Online Portfolio Builder!

---

##  Future Enhancements

* User Authentication
* Dashboard for managing multiple portfolios
* Image uploads for profile and projects
* Additional templates and font customization
* One-click deployment (GitHub Pages / Netlify / Vercel)
* Analytics for portfolio views

---

##  Contributing

Feel free to fork the repository, make improvements, and submit pull requests.
