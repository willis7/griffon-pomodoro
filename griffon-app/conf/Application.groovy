application {
    title = 'LvPomodoro'
    startupGroups = ['lv-pomodoro']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "lv-pomodoro"
    'lv-pomodoro' {
        model      = 'lv.pomodoro.LvPomodoroModel'
        view       = 'lv.pomodoro.LvPomodoroView'
        controller = 'lv.pomodoro.LvPomodoroController'
    }

}
