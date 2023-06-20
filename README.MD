# Extensive Github Actions usage for Spring Boot Project

This repository explores the possible CI/CD configrautions for trunk based development workflow with a demo spring boot project.
It tries to reflect on best practices and recommended ways on how to implement those practices.

**Continuous Integration Workflow**
* Kotlin & Java Build
* Basic Testing
* Extensible
* Seperated from deployment

**Continuous Deployment Workflow**
* Support for multiple environments (dev, preprod, prod)
* Support OCI Image Builds
* Support version tags
* Support tagged images
* AWS Elastic Container Registry or Github Container Registry (GHCR) as Image Registry
* Deployment Options for AWS EKS (Elastic Kubernetes Service)
* Announcements on Slack, Teams
