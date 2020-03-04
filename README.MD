# DeltaAPI

Ce repository contient l'API publique de Delta Client. 

## Utiliser

Vous pouvez importer l'API en utilisant Gradle 
```gradle
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
	compile("me.xtrm.delta:delta-api:1.2s.0")
}
```

## Compiler

Si vous souhaitez le compiler vous-même:
```bash
# Clone the current repo
git clone https://github.com/xTrM-EN/DeltaAPI.git

# Enter the cloned repo
cd DeltaAPI/

# Build the artifact
./build.bat
```