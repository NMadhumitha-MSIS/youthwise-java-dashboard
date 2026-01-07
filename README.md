# YouthWise — Java Swing Dashboard Application

## Overview
YouthWise is a Java Swing-based dashboard application designed to track and visualize user information across academics, health, and sports. The project focuses on building an interactive UI for managing profiles, viewing records, and exploring insights through charts.

## Key Features
- Role-based workflows and dashboards (multi-panel Swing UI)
- Manage and view user-related records (academics / health / sports)
- Interactive visualizations for trends and summaries
- Data persistence using DB4O (object database)

## Tech Stack
- Java
- Java Swing (UI)
- NetBeans (project structure/build)
- DB4O (local persistence)

## Repository Structure
- `src/` — Java source code (UI + business logic)
- `nbproject/` — NetBeans project configuration
- `build.xml` — Ant build script

## How to Run (NetBeans Recommended)
1. Install Java (JDK 19+ recommended)
2. Open NetBeans → File → Open Project
3. Select the project folder (contains `src/`, `nbproject/`, `build.xml`)
4. Run the project:
   - Open `src/ui/WelcomePage.java`
   - Right-click → Run File  
   OR click the green Run button

## Notes
- `nbproject/private/` is intentionally not tracked (machine-specific settings)
- The DB file (`Databank.db4o`) is not committed to avoid sharing local data. The app can create a fresh local DB when run.
