# Stage 1: Build React app
FROM node:14.15.0 AS react-builder
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build

# Stage 2: Create the final image with NGINX
FROM nginx:alpine
WORKDIR /usr/share/nginx/html
COPY --from=react-builder /app/build .