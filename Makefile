# Tên image, có thể override bằng biến môi trường
APP_IMAGE ?= demo-app:local

# File docker-compose sử dụng
COMPOSE = docker compose -f compose/docker-compose.yml

# Build Docker image
build:
	docker build -t $(APP_IMAGE) .

# Up stack: build trước, sau đó up container
up: build
	$(COMPOSE) up -d

# Down stack
down:
	$(COMPOSE) down

# Xem logs app
logs:
	$(COMPOSE) logs -f app

# Xem trạng thái container
ps:
	$(COMPOSE) ps
