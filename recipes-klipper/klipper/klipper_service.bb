
LICENSE = "CLOSED"

inherit systemd

include klipper.inc

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "${KLIPPER_SERVICE}"

KLIPPER_SERVICE_TEXT = " \
    #Systemd service file for klipper \
    [Unit] \
    Description=Starts klipper on startup \
    After=network.target \
    \
    [Install] \
    WantedBy=multi-user.target \
    \
    [Service] \
    Type=simple \
    User=${KLIPPER_USERNAME} \
    RemainAfterExit=yes \
    ExecStart=${bindir}/python ${bindir}/klipper/klippy.py /home/${KLIPPER_USERNAME}/printer.cfg -l /home/${KLIPPER_USERNAME}/${KLIPPER_LOG} \
"

FILES:${PN} += "${systemd_unitdir}/system/${KLIPPER_SERVICE}"

do_install:append() {
  install -d ${D}/${systemd_unitdir}/system
  echo "${KLIPPER_SERVICE_TEXT}" > ${D}/${systemd_unitdir}/${KLIPPER_SERVICE}
  install -m 0644 ${WORKDIR}/${KLIPPER_SERVICE} ${D}/${systemd_unitdir}/system
}

