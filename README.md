# Azure Data Explorer (ADX) README

## Overview

Azure Data Explorer (ADX) is a fully managed, high-performance big data analytics platform designed to enable the analysis of large volumes of data in near real-time. ADX provides a comprehensive suite of tools for data ingestion, querying, visualization, and management, making it ideal for scenarios that demand rapid insights and immediate actions.

## Goals and Purpose

The primary goal of Azure Data Explorer is to facilitate efficient querying and analysis of massive datasets to support high-performance analytics and decision-making processes. Specifically, ADX is excellent for querying Logic Apps to meet Geographic Information System (GIS) requirements due to its capability to handle substantial log data volumes and perform complex queries with low latency.

## Key Resources in Azure Data Explorer

Setting up and managing Azure Data Explorer involves several critical resources. Below is an outline of three essential Azure resources used in ADX, along with their purposes and reasons for their necessity:

### 1. `azurerm_kusto_cluster`

- **Purpose:**
  The `azurerm_kusto_cluster` is the core computing resource in Azure Data Explorer. It represents the cluster where data is stored and queried. This cluster provides the necessary computational power to manage high-throughput and low-latency queries on large datasets.

- **Why It’s Required:**
  - **Scalability:** Supports the ingestion and querying of massive amounts of data.
  - **Performance:** Ensures high-performance querying capabilities.
  - **Management:** Centralizes data storage and computational resources.

### 2. `azurerm_kusto_database`

- **Purpose:**
  The `azurerm_kusto_database` serves as a logical container within a Kusto cluster. It is where data is stored and organized, and from where data is ingested and queried.

- **Why It’s Required:**
  - **Organization:** Helps in organizing and structuring the data within the cluster.
  - **Querying:** Acts as the main unit for data storage and retrieval operations.
  - **Management:** Simplifies data management within the cluster environment.

### 3. `azurerm_kusto_cluster_customer_managed_key`

- **Purpose:**
  The `azurerm_kusto_cluster_customer_managed_key` allows for the integration of a customer-managed encryption key (CMK) with a Kusto cluster. This key is used to encrypt data stored in the cluster, providing an additional layer of security.

- **Why It’s Required:**
  - **Security:** Enhances data security by allowing you to manage and control the encryption keys.
  - **Compliance:** Assists in meeting specific regulatory and compliance requirements related to data security.
  - **Control:** Provides greater control over the encryption processes and key management.

## Azure Policy Built-In Definitions for ADX

To ensure security and compliance, Azure provides several built-in policy definitions specific to Azure Data Explorer. These policies help enforce organizational standards and assess compliance. Below is a simplified explanation of each built-in policy, with the default effect set to **Audit** unless specified otherwise.

### 1. Azure Data Explorer Encryption at Rest Should Use a Customer-Managed Key

- **Description:** Ensures data in ADX is encrypted using a key managed by you, not by Microsoft, providing extra security and compliance control.
- **Why It Matters:**
  - **Security Control:** You manage the encryption key, offering tighter security for your data.
  - **Compliance:** Meets specific regulatory requirements regarding data security.
- **Effects:**
  - **Audit:** Checks if customer-managed keys are used and reports non-compliance.
  - **Deny:** Prevents the creation of clusters without customer-managed keys.
  - **Disabled:** The policy is not enforced.
- **Version:** 1.0.0

### 2. Disk Encryption Should Be Enabled on Azure Data Explorer

- **Description:** Requires that disks used by ADX are encrypted to protect data at rest and meet security needs.
- **Why It Matters:**
  - **Data Protection:** Ensures stored data is encrypted and secure from unauthorized access.
  - **Compliance:** Helps meet security standards requiring disk encryption.
- **Effects:**
  - **Audit:** Monitors and reports clusters without disk encryption.
  - **Deny:** Prevents the creation of clusters without encrypted disks.
  - **Disabled:** The policy does not enforce compliance.
- **Version:** 2.0.0

### 3. Double Encryption Should Be Enabled on Azure Data Explorer

- **Description:** Enforces double encryption, providing an additional layer of security by encrypting data twice using different methods and keys.
- **Why It Matters:**
  - **Extra Security Layer:** Adds robust security by encrypting data twice.
  - **Compliance:** Useful for meeting stringent security and compliance requirements.
- **Effects:**
  - **Audit:** Checks and reports if double encryption is not enabled.
  - **Deny:** Prevents setting up clusters without double encryption.
  - **Disabled:** The policy is inactive.
- **Version:** 2.0.0

### 4. Virtual Network Injection Should Be Enabled for Azure Data Explorer

- **Description:** Requires ADX to be integrated with a virtual network, securing the network boundaries and allowing the application of network security rules.
- **Why It Matters:**
  - **Network Security:** Protects data by controlling which networks can access ADX.
  - **Compliance:** Meets network security requirements through virtual network controls.
- **Effects:**
  - **Audit:** Identifies clusters not integrated with a virtual network.
  - **Deny:** Blocks clusters that are not within a virtual network.
  - **Disabled:** The policy is not enforced.
- **Version:** 1.0.0

### 5. Azure Data Explorer Should Use a SKU That Supports Private Link

- **Description:** Mandates using a specific SKU (service level) of ADX that supports Private Link, allowing secure, private connections.
- **Why It Matters:**
  - **Data Security:** Ensures secure data transfer within private networks, avoiding public internet exposure.
  - **Compliance:** Helps in meeting data security requirements by avoiding public internet connections.
- **Effects:**
  - **Audit:** Reports if the appropriate SKU is not used.
  - **Deny:** Prevents the use of SKUs that don't support Private Link.
  - **Disabled:** The policy does not take any action.
- **Version:** 1.0.0

### 6. Public Network Access Should Be Disabled on Azure Data Explorer

- **Description:** Requires public network access to be disabled for ADX clusters, ensuring access is only through private networks.
- **Why It Matters:**
  - **Security Enhancement:** Reduces unauthorized access risks by disallowing public network access.
  - **Data Protection:** Ensures data is accessible only through secure, private networks.
- **Effects:**
  - **Audit:** Checks if clusters have public network access enabled and reports them.
  - **Deny:** Blocks the creation of clusters with public network access.
  - **Disabled:** No action is taken.
- **Version:** 1.0.0

### 7. Configure Azure Data Explorer to Disable Public Network Access

- **Description:** Automatically disables public network access for all ADX clusters, ensuring they can only be accessed through private endpoints.
- **Why It Matters:**
  - **Automated Security:** Secures clusters by automatically disabling public network access.
  - **Data Safety:** Ensures data is only accessible through private, secure channels.
- **Effects:**
  - **Modify:** Changes the configuration of existing clusters to disable public network access.
  - **Disabled:** The policy is inactive.
- **Version:** 1.0.0

### 8. Azure Data Explorer Cluster Should Use a Private Link

- **Description:** Ensures ADX clusters are accessed through a Private Link, providing secure, private connections within the Azure backbone network.
- **Why It Matters:**
  - **Secure Access:** Limits access to clusters to private, secure connections only.
  - **Reduced Exposure:** Minimizes data leakage risks by avoiding public internet connections.
- **Effects:**
  - **Audit:** Monitors and reports clusters that do not use Private Link.
  - **Disabled:** No enforcement action is taken.
- **Version:** 1.0.0

### 9. Configure Azure Data Explorer Clusters with Private Endpoints

- **Description:** Automatically sets up private endpoints for ADX clusters, ensuring secure connections without public IPs.
- **Why It Matters:**
  - **Private Connectivity:** Ensures that data is only accessible within your private network.
  - **Security Compliance:** Helps meet security policies by using private connections.
- **Effects:**
  - **DeployIfNotExists:** Automatically sets up private endpoints if they do not already exist.
  - **Disabled:** The policy does not enforce any action.
- **Version:** 1.0.0

## Conclusion

Azure Data Explorer is a powerful platform for high-performance analytics and decision-making. By leveraging the key resources and adhering to Azure Policy built-in definitions, you can ensure that your data is secure, compliant, and efficiently managed.
