# Etapa 1: Build da aplicação
FROM node:18 AS build

# Definir diretório de trabalho
WORKDIR /app

# Copiar package.json e package-lock.json
COPY package*.json ./

# Instalar dependências
RUN npm install

# Copiar todo o código
COPY . .

RUN npm run build

FROM nginx:stable-alpine

COPY --from=build /app/build /usr/share/nginx/html

EXPOSE 80

# Comando para iniciar o Nginx
CMD ["nginx", "-g", "daemon off;"]
