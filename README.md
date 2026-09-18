# HomeSecure – Smart Home Control

HomeSecure is a smart home control Android application built in Java that allows users to monitor and control devices in their home, including lighting, air conditioning, and security systems.

## 👤 Author

- **Name:** Mohammed Kaif Ulla
- **USN:** 25MCAR0226

## 🔗 Repository

https://github.com/MohdKaifUlla/HomeSecure.git

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
  (https://github.com/MohdKaifUlla/HomeSecure.git)
2. Open the project in Android Studio.
3. Let Gradle sync (requires Gradle 8.6 and a JDK between versions 8–21).
4. Run the app on an emulator or physical device (API 24+).

## 📸 Output Screenshots

<img width="738" height="1600" alt="homesecure 1" src="https://github.com/user-attachments/assets/168d5d97-f39f-423a-b5a7-38ae59831f02" />
<img width="738" height="1600" alt="homesecure 2" src="https://github.com/user-attachments/assets/774ef8b7-2de2-4e67-85df-56a662b5f21a" />
<img width="738" height="1600" alt="homesecure 3" src="https://github.com/user-attachments/assets/0fd7eff9-b774-46e4-b619-bc9ca7c69fec" />
<img width="738" height="1600" alt="homesecure 4" src="https://github.com/user-attachments/assets/7d748e90-9d3c-4d75-8735-3ba3c25eec37" />
<img width="738" height="1600" alt="homesecure 5" src="https://github.com/user-attachments/assets/cb1331ea-3214-48fb-a4f3-636efc5b6223" />
<img width="738" height="1600" alt="homesecure 6" src="https://github.com/user-attachments/assets/a0a08a16-6053-4cf8-bc66-dd4d8ad8c5d6" />
<img width="738" height="1600" alt="homesecure 7" src="https://github.com/user-attachments/assets/bdf3b5d9-92ca-4e32-bab7-76e1efb55baf" />
<img width="738" height="1600" alt="homesecure 8" src="https://github.com/user-attachments/assets/901a0bda-bb71-4c56-818d-f0a97b1c2ecf" />
<img width="738" height="1600" alt="homesecure 9" src="https://github.com/user-attachments/assets/3cfb38f7-bbb3-4386-ba69-1be94785066a" />
<img width="738" height="1600" alt="homesecure 10" src="https://github.com/user-attachments/assets/5f7a8c24-5f3a-42cf-9fee-7c6780eb12e9" />

## 📄 License

This project was created for academic/practical purposes.
