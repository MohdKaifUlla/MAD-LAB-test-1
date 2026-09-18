# HomeSecure – Smart Home Control

HomeSecure is a smart home control Android application built in Java that allows users to monitor and control devices in their home, including lighting, air conditioning, and security systems.

## 👤 Author

- **Name:** Mohammed Kaif Ulla
- **USN:** 25MCAR0226

## 🔗 Repository

[Add your GitHub repository link here]

## 📱 About the App

HomeSecure demonstrates core Android development concepts through a practical smart home use case:

- **Activity & Fragment lifecycle management** with Logcat demonstration
- **Multiple Fragments** for Lighting, Air Conditioning, and Security control
- **RadioGroup / RadioButton** for room and security mode selection
- **SeekBar** for adjusting brightness and temperature
- **ToggleButton** for switching devices ON/OFF
- **Intent** for passing data between Activities
- **Notifications** with a dedicated notification channel
- **Runtime permission handling** for Android 13+ (`POST_NOTIFICATIONS`)

## 🛠️ Tech Stack

- **Language:** Java
- **UI:** XML Layouts (LinearLayout, ConstraintLayout, CardView)
- **Architecture:** Single Activity + Fragments (FragmentContainerView)
- **Min SDK:** 24
- **Target SDK:** 34
- **Build Tool:** Gradle 8.6 / Android Gradle Plugin 8.1.4

## 📂 Project Structure

```
HomeSecure/
├── app/
│   └── src/main/
│       ├── java/com/example/homesecure/
│       │   ├── MainActivity.java
│       │   ├── SecurityStatusActivity.java
│       │   └── fragments/
│       │       ├── LightingFragment.java
│       │       ├── AirConditioningFragment.java
│       │       └── SecurityFragment.java
│       ├── res/
│       │   ├── layout/
│       │   ├── drawable/
│       │   └── values/
│       └── AndroidManifest.xml
├── build.gradle
├── settings.gradle
└── gradle.properties
```

## ✨ Features

### Lighting Control
- Select a room (Living Room / Bedroom / Kitchen)
- Adjust brightness using a SeekBar
- Turn the light ON/OFF with a ToggleButton

### Air Conditioning Control
- Adjust temperature (16°C – 30°C) using a SeekBar
- Turn the AC ON/OFF with a ToggleButton

### Security Control
- Select a security mode (Home / Away / Night)
- Activate security, which:
  - Sends the selected mode to `SecurityStatusActivity` via an `Intent`
  - Updates the security status shown on the home screen
  - Triggers a system notification confirming activation

## 🚀 Getting Started

1. Clone this repository:
   ```bash
   git clone [Add your GitHub repository link here]
   ```
2. Open the project in Android Studio.
3. Let Gradle sync (requires Gradle 8.6 and a JDK between versions 8–21).
4. Run the app on an emulator or physical device (API 24+).

## 📸 Output Screenshots

[Add your output screenshots here]

## 📄 License

This project was created for academic/practical purposes.
