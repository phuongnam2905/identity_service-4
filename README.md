# Demo Spring Boot + PostgreSQL + Docker

## 🚀 Quy trình chạy (prod-like)

```bash
# build app image
docker build -t demo-app:local .

# copy env
cp .env.example .env

# start
docker compose -f compose/docker-compose.yml up -d
docker compose -f compose/docker-compose.yml ps
