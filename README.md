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

<img width="738" height="1600" alt="homesecure 1" src="https://github.com/user-attachments/assets/f813a3f2-3197-45d4-8c4b-45fe43257272" />
<img width="738" height="1600" alt="homesecure 2" src="https://github.com/user-attachments/assets/b0a83b92-e991-4188-a759-402b5b1ef923" />
<img width="738" height="1600" alt="homesecure 3" src="https://github.com/user-attachments/assets/940f669d-6244-4151-8221-9aaf8948bfa8" />
<img width="738" height="1600" alt="homesecure 4" src="https://github.com/user-attachments/assets/e24c8ba0-00c8-447e-a13c-d388673584cd" />
<img width="738" height="1600" alt="homesecure 5" src="https://github.com/user-attachments/assets/e0287c5f-5972-4562-9df3-1e4aeae62ffa" />
<img width="738" height="1600" alt="homesecure 6" src="https://github.com/user-attachments/assets/8bd42b5e-b053-4261-9195-601e8c373ad3" />
<img width="738" height="1600" alt="homesecure 7" src="https://github.com/user-attachments/assets/be4c3e56-cf5f-4e09-bdc0-79c831dcf81d" />
<img width="738" height="1600" alt="homesecure 8" src="https://github.com/user-attachments/assets/7aa13408-7b32-42ed-a107-95c50b1daf5d" />
<img width="738" height="1600" alt="homesecure 9" src="https://github.com/user-attachments/assets/d5e603e6-77e0-4414-b8e6-a9185e04e9d9" />
<img width="738" height="1600" alt="homesecure 10" src="https://github.com/user-attachments/assets/24fc4b8d-4d7f-43e8-800e-5b0164bc902b" />

## 📄 License

This project was created for academic/practical purposes.
