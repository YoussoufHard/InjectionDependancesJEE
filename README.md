# Injection des Dépendances en Java – Rapport de TP

## 📌 Introduction
Ce projet explore l'injection des dépendances en Java en utilisant différentes méthodes :  
✔ Instanciation statique  
✔ Instanciation dynamique  
✔ Spring (XML & Annotations)  
✔ Mini-framework personnalisé

## 🎯 Objectifs
- Comprendre le principe de l'inversion de contrôle (IoC)
- Implémenter un couplage faible avec l'injection des dépendances
- Utiliser **Spring IoC** pour simplifier la gestion des dépendances
- Créer un **mini-framework** simulant le comportement de Spring

---

## 📁 Structure du projet

Le projet est organisé en plusieurs packages selon les couches de l'application :

```
src
├── main
│   ├── java
│   │   ├── dao               → Interface IDao + Implémentation DaoImp
│   │   ├── ext               → Deuxième implémentation DaoImpV2
│   │   ├── metier            → Interface IMetier + Implémentation MetierImp
│   │   └── pres              → Classes de présentation (exécution)
│   └── resources
│       └── config.xml        → Fichier de configuration Spring (version XML)
```

---

## ✅ Prérequis

- Java JDK 8 ou supérieur
- IntelliJ IDEA
- Maven
- Git

---

## 📦 Clonage du projet

1. Cloner le dépôt :

[`https://github.com/YoussoufHard/InjectionDependancesJEE.git`](https://github.com/YoussoufHard/InjectionDependancesJEE.git)

 ```sh
   git clone https://github.com/YoussoufHard/InjectionDependancesJEE.git
    cd mon-repo
   ``` 
2. Ouvrir le projet dans **IntelliJ IDEA** :
   - `File` > `Open` > Sélectionner le dossier du projet
   - Attendre la configuration automatique de Maven
   - Exécuter les classes de présentation situées dans le package `pres`

---

## 📌 Partie 1 : Injection de Dépendances

Cette première partie illustre différentes manières d’injecter une dépendance dans une classe métier :

### Étapes réalisées :

1. Création de l'interface `IDao` avec une méthode `getData`
2. Implémentation concrète de cette interface (`DaoImp`, `DaoImpV2`)
3. Création de l'interface `IMetier` avec une méthode `calcul`
4. Implémentation de `IMetier` via couplage faible (`MetierImp`)
5. Injection des dépendances par :
   - Instanciation **statique**
   - Instanciation **dynamique** (réflexion)
   - Utilisation du **framework Spring** :
     - Version XML (`config.xml`)
     - Version annotations (`@Autowired`, `@Component`, etc.)

---

## 📷 Diagramme de classe

Voici le diagramme de classe de la Partie 1 :

![Diagramme de classe](/captures/img.png)

---

## ▶️ Exécution

Chaque version de l’injection est testée dans une classe de présentation différente :

| Classe                      | Type d'injection         |
|----------------------------|--------------------------|
| `PresentationV1`           | Instanciation statique   |
| `PresentationV2`           | Instanciation dynamique  |
| `PrresAvecSpringXML`       | Spring XML               |
| `PressSpringAnnotation`    | Spring Annotations       |

Pour exécuter, il suffit de faire un clic droit sur la classe et choisir `Run`.

Ceci est une capture de l'une des cas
![Diagramme de classe](/captures/img_1.png)

---

## 📂 Partie 2 : Mini-Framework IoC

Cette seconde partie présente un mini framework d'injection basé sur :

- Injection via **XML** (JAX Binding)
- Injection via **Annotations**
- Injection par **Constructeur**, **Setter** ou **Attribut**

> 📌 Cette partie est en cours de finalisation dans le projet.

---

## 🙌 Réalisé par

**Auteur :** Youssouf  Tangara  
**Encadré par :** Prof. Mohamed Youssfi  
**Projet pédagogique :** Cours Java JEE – Injection de dépendances avec Spring Framework
---

## 📜 Licence

Projet open-source à but pédagogique.