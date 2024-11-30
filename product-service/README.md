```bash
 docker run --name postgre -e POSTGRES_DB=product -e POSTGRES_USER=local -e POSTGRES_PASSWORD=local -p 5432:5432 -d postgres:17