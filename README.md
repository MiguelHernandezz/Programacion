<div align="center">

# ☕ Programación · UAH

**Programming (Programación, 781000) · B.S. Computer Engineering · Universidad de Alcalá · 2024–2025**

![Java](https://img.shields.io/badge/Java_17+-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Swing_GUI-161B22?style=flat-square)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![Team](https://img.shields.io/badge/team-3_people-00C853?style=flat-square)

</div>

> Team project (3 people). Teammates' names omitted for privacy.

---

## 📁 Contents

| Folder | Project |
|---|---|
| [`PL2-gestion-eventos`](PL2-gestion-eventos) | **JavaEvents**: desktop app to publish, search, book and rate events (concerts, theatre, sports…) |

---

## PL2 · JavaEvents: event booking desktop app

A Java Swing application with two roles:

| Role | What they can do |
|---|---|
| **Client** | Sign up (with address, credit card and VIP flag), log in, search events by city or type, book an event, see their bookings, rate events (0–5), edit their profile |
| **Administrator** | Create and edit events (title, type, venue, date, price), list users and all bookings |

**How it's built**

- **OOP model** (`conexion/`): `Usuario`, `Eventos`, `Reserva`, `TarjetaCredito`, `Direccion`… plus service classes for sign-up, login, booking and event management.
- **Persistence:** a singleton `EstructuraDeDatos` holding `HashMap`s of users, events and bookings, saved to and loaded from `eventos_db.dat` with Java **object serialization**.
- **GUI** (`interfaz/`): 16 Swing windows designed with the NetBeans GUI Builder (`.form` files).
- **Build:** Maven, producing a single runnable jar.

---

## ▶️ Run it

Requires **Java 17 or newer** and **Maven**.

```bash
cd PL2-gestion-eventos
mvn package
java -jar target/JAVAEVENTS.jar
```

Run it from the `PL2-gestion-eventos` folder: the app reads and writes `eventos_db.dat` in the current directory, which ships with sample data (4 users, 6 events, 3 bookings).

**Sample accounts** (test data only):

| Role | Email | Password |
|---|---|---|
| Administrator | `admin@javaevents.com` | `admin` |
| Client | `juan@email.com` | `claveSegura123` |
| Client | `lola@email.com` | `lolita1111` |

To start with an empty database, delete `eventos_db.dat`. A new one is created on the first save.

You can also open the folder in **NetBeans** (*File → Open Project*) and run it from there.

---

<div align="center">

Miguel Hernández López · [GitHub](https://github.com/MiguelHernandezz) · [LinkedIn](https://www.linkedin.com/in/miguel-hernandez-lopez/)

</div>
