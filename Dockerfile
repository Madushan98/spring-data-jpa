FROM postgres:latest

# Set environment variables
ENV POSTGRES_USER root
ENV POSTGRES_PASSWORD password
ENV POSTGRES_DB datajpa


# Expose default PostgreSQL port
EXPOSE 5432