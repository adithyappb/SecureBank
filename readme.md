## SecureBank: Secure Mobile Banking Application

# Project Overview
SecureBank is a feature-rich, secure mobile banking app built using Android SDK, Kotlin, Jetpack Compose, and follows the MVVM architecture. It integrates gRPC for communication, RESTful APIs for transactions, and GraphQL for querying user data. The app is optimized for minimal resource consumption and provides a seamless banking experience.

# Prerequisites
- Android Studio (latest stable version)
- Kotlin (preferably 1.7+)
- Gradle (automatically handled by Android Studio)
- Firebase for authentication (if needed for your app)
- AWS SDK setup (if using AWS services for cloud integration)

# Project Setup

# Step 1: Open in Android Studio
- Open Android Studio.
- Click on Open an existing project and navigate to the SecureBank project folder.
- Wait for Gradle to sync and download necessary dependencies.

# Step 2: Configure Dependencies
- gRPC: Ensure that you have the necessary gRPC libraries included in your build.gradle file under dependencies.
- AWS: If using AWS services (Lambda, DynamoDB), configure your AWS credentials in the app's build.gradle for required plugins and dependencies.

# Step 3: Set up Firebase (Optional - If you're using Firebase for authentication or other services)
- Go to the Firebase Console.
- Create a new project or use an existing one.
- Add the google-services.json file to the app/ directory of your project.

# Step 4: Run the Project
- Ensure an emulator or a physical device is connected.
- Click Run in Android Studio or use the following command:
- ./gradlew installDebug

# Step 5: Testing & Profiling
- Run unit and UI tests using Espresso, Robolectric, and MockK.
- Perform memory, CPU, and battery profiling using Android Studio’s profiling tools.

# Step 7: Build APK
- To build the APK for release:
- ./gradlew assembleRelease

# You can find the APK in:
- app/build/outputs/apk/release/.


