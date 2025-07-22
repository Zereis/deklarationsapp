# Deklarationsappen

En modern webbapplikation för att hantera och spara deklarationer. Byggd med React (frontend) och Spring Boot (backend).

![Deklarationsappen demo](https://i.imgur.com/iuRrg3k.png)

## Funktioner

- Lägg till, visa och hantera deklarationer
- Enkel och tydlig design
- Backend med Spring Boot, frontend med React/TypeScript
- Kommunikation via REST API

## Kom igång

### Klona projektet

```sh
git clone https://github.com/Zereis/deklarationsapp.git
cd deklarationsapp
```

### Starta backend

```sh
cd deklaration-backend
./gradlew bootRun
```
_Backend körs nu på http://localhost:8080_

### Starta frontend

```sh
cd ../deklaration-frontend
npm install
npm start
```
_Frontend körs nu på http://localhost:3000_

## Deployment

Frontend kan enkelt deployas på t.ex. Vercel eller Netlify.  
Backend kan deployas på valfri Java-kompatibel server.

## Skärmdump

![Skärmdump](https://i.imgur.com/iuRrg3k.png)

## Licens

MIT
