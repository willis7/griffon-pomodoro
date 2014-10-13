package lv.pomodoro

import groovy.beans.Bindable

class LvPomodoroModel {
    @Bindable String timeRemaining = "25:00"
    @Bindable String startLabel = "Start"
    Timer timer = null

    long currTime = 0L
    long finishTime = 0L
    long pauseTime = 0L
}