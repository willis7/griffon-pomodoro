package lv.pomodoro

import java.awt.Font

application(title: 'lv-pomodoro', pack: true, locationByPlatform: true,) {
    panel() {
        borderLayout()
        panel( constraints: CENTER ) {
            label( text: bind { model.timeRemaining }, font: new Font( "Ariel", Font.BOLD, 48 ) )
        }
        panel(constraints: SOUTH) {
            flowLayout()
            button( id: 'start', text: bind { model.startLabel }, actionPerformed: controller.startStopAction )
            button( id: 'reset', text: 'Reset', actionPerformed :controller.resetAction )
        }
    }
}
