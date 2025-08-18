# 🎮 JogueFácil - LanHouse

Este projeto é um sistema de gerenciamento de **Lan House** desenvolvido em **Java Spring Boot**, com banco de dados **PostgreSQL**, mensageria com **Kafka** e suporte a **MongoDB**.  

O objetivo principal é praticar conceitos de **containerização (Docker)** e **orquestração (Kubernetes)**, aplicando boas práticas de microsserviços, ConfigMaps e Secrets.

---

## 🚀 Tecnologias Utilizadas
- **Java 17 / Spring Boot**
- **Gradle**
- **PostgreSQL**
- **MongoDB**
- **Kafka**
- **Docker**
- **Kubernetes**

---

## 📦 Estrutura no Kubernetes
- **Deployment do PostgreSQL** com volume persistente.
- **Deployment do Kafka** com service interno.
- **Deployment da aplicação LanHouse** conectando nos serviços acima.
- Uso de **ConfigMaps** para variáveis não sensíveis (ex.: cor da aplicação, configurações).
- Uso de **Secrets** para armazenar dados sensíveis (usuário e senha do banco, etc).

⚠️ **Atenção**:  
Neste repositório, os arquivos de **Secret** estão expostos em texto puro apenas para **fins acadêmicos e de prática**.  
Em ambientes de produção **NUNCA** se deve versionar Secrets dessa forma. O correto é utilizar ferramentas como:
- [Sealed Secrets](https://github.com/bitnami-labs/sealed-secrets)  
- [HashiCorp Vault](https://www.vaultproject.io/)  
- Integrações nativas de provedores cloud (AWS Secrets Manager, GCP Secret Manager, etc).
