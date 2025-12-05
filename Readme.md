# How to Generate Javadoc

1. Initialize git repository
1. Create public repository on github
1. Push your changes
1. Go to your github repository and add a new file
1. In name your file paste `.github/workflows/javadoc.yml`
1. Then paste the following into the file contents:
```yml
name: Publish Javadocs

on:
  push:
    branches:
      - main   # Trigger on pushes to main (change if needed)

permissions:
  contents: write   # Required to push to another branch

jobs:
  build-and-publish:
    runs-on: ubuntu-latest

    steps:
    - name: Checkout repository
      uses: actions/checkout@v4
      with:
        fetch-depth: 0   # Needed to push later

    - name: Set up JDK
      uses: actions/setup-java@v4
      with:
        distribution: temurin
        java-version: 17   # or your version

    - name: Generate Javadocs
      run: |
        mkdir -p javadoc
        javadoc -d javadoc *.java
        
    - name: Deploy to javadoc branch
      uses: peaceiris/actions-gh-pages@v3
      with:
        github_token: ${{ secrets.GITHUB_TOKEN }}
        publish_branch: javadoc
        publish_dir: javadoc
```
1. Go to the "Actions" tab and wait for the action to complete
1. In the github repository, go to "Settings" then pages on the left side and select the javadoc branch to deploy
1. Go back to the "Actions" and wait for the "pages build and deployment" action to complete
1. Your documentation will be available at (username).github.io/(repository_name), if you click on the action a link will be displayed in the graph