# Injection des Dépendances en Java – Rapport de TP

## 1. Introduction

L'injection des dépendances (DI) est un concept fondamental en **programmation orientée objet** qui permet de réduire le **couplage fort** entre les composants d’une application. Ce TP a pour objectif d’explorer différentes techniques d’injection des dépendances en Java, allant de l’instanciation statique et dynamique à l’utilisation du framework **Spring**.

Dans la première partie, nous implémenterons une application simple en appliquant les principes de **l’inversion de contrôle (IoC)** et de l’injection des dépendances. Nous verrons plusieurs méthodes d’injection :
- **Injection par instanciation statique**
- **Injection par instanciation dynamique**
- **Injection avec Spring** (via XML et annotations)

Dans la seconde partie, nous développerons un **mini-framework d’injection des dépendances**, inspiré de **Spring IoC**, qui permettra d’injecter des dépendances via :
- **Un fichier XML** (utilisant JAX Binding pour le mapping objet-XML)
- **Les annotations**
- **Différentes méthodes d’injection** (constructeur, setter, accès direct aux attributs)

Ce TP nous permettra de comprendre les principes de **modularité, extensibilité et maintenabilité** dans une application Java en appliquant les bonnes pratiques du développement logiciel.

---
