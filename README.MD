# DeltaAPI

Le repository contenant l'API publique de Delta Client. 

## Utiliser

Vous pouvez importer l'API en utilisant Gradle 
```
repositories {
    jcenter()
    
    maven {
    	url = "https://nkosmos.github.io/maven/" // DeltaAPI
    }
    maven {
		url = "https://atlaspluginloader.github.io/maven/" // APL-Core
	}
}

dependencies {
	compile("me.xtrm.delta:delta-api:1.0.0")
}
```

## Compiler

La dernière version stable se trouve dans l'onglet "releases".

Si vous souhaitez le compiler vous-mêmes:
```bash
# Clone the current repo
git clone https://github.com/xTrM-EN/DeltaAPI.git

# Enter the cloned repo
cd DeltaAPI/

# Build the artifact
gradlew build
```