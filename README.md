# 🧱 Microservices Architecture Sample Project

Welcome to the **Microservices Sample Project**! 🎉
This is a simple demo showing how to build and organize a system using the **Microservice Architecture** pattern. Each service is independent and communicates over HTTP or messaging.

---

## 📦 Features

* 🧩 Independent microservices
* 🚪 API Gateway (optional)
* 📡 Inter-service communication (REST / messaging)
* 🐘 Separate databases per service
* 🔐 Basic authentication (optional)

---

## 🚀 Getting Started

1. **Run with Docker**

   ```bash
   docker-compose up --build
   ```

2. **Access services**

   * Auth: `http://localhost:3001`
   * User: `http://localhost:3002`
   * Product: `http://localhost:3003`
   * Gateway: `http://localhost:3000` *(if included)*

---

## 📬 Communication

* REST (HTTP) between services

---

## 📄 License

MIT License 📜

---
