# API Java pour le WebService Mondial Relay

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.dajlab/mondialrelay-api/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.dajlab/mondialrelay-api)

Voir https://www.mondialrelay.fr/media/122867/solution-web-service-v57.pdf pour plus d'informations sur l'API officielle Mondial Relay.

Pour obtenir un code Enseigne et une clé privée, vous devez disposer d'un compte Pro chez Mondial Relay.

Pour l'instant, seul le suivi d'un colis est implémenté (la couche SOAP est cependant complète).

## Cas d'utilisation

Pour obtenir le suivi d'un colis :

```java
IMondialRelayService service = new MondialRelayServiceImpl("codeEnseigne", "clePrivee");

MRSuiviColis suivi = service.getSuivi("12345678");
```

Pour exécuter le test unitaire, vous devez ajouter un fichier parameters.properties dans les resources avec les clés suivantes :

    enseigne=
    cleprivee=
