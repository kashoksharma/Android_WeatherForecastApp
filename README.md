# Android_WeatherForecastApp
This project is showing the weather report of a city. Focus of this project to use the different UI layout to create good UI and try to use as many features as possible. Fragment based UI is used to show the two views for Daily and Weekly status.  Applications target to shows the following information:
City name, country name, date, temperature, wind speed, wind direction,
pressure, humidity, rain forecast, sunrise, sunset, UV index

In addition, after UI part is done, focus is to implement the interaction with forecast.io to fetch the latest data and refresh the screen. This part has lower priority, as primary motive is to implement the UI part and show the knowledge in UI activities.
Following section present the details about the different UI layout features implemented. 
Package:  com.example.weatherforecastapp.*
XML file	              Layout features	                                Comments
MapActivity.xml	        Use WebView (MAP), Bottom Navigation View       feature	Use MAP and Navigation view at bottom of screen UI
                        Bottom Navigation View
GraphActivity.xml	      Scroll View UI feature                          Scrolling feature supported
	                      Bar and Line Chart	                            Use of Bar and Line chart with William Chart library. 
                                                                        Require changes in Project and Application specific build.gradle file.

activity_scrolling.xml	AppBarLayout
                        CollapsingToolbarLayout	                        To support scroll with collapsing the top part feature on scroll down.

Prefs.xml	              Preference Screen and Category	                For the Settings, use the PreferenceActivity and SharedPreferences.
		



