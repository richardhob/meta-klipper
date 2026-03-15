
inherit useradd

include klipper.inc

USERADD_PACKAGES = "${PN}"
USERADD_PARAM:${PN} = "-u 1000 -p ${KLIPPER_USERNAME} -d /home/${KLIPPER_USERNAME} -G dialout,plugdev -r -s /bin/bash ${KLIPPER_USERNAME};"
LICENSE = "CLOSED"

do_install() {
    install -d ${D}/home/${KLIPPER_USERNAME}
    touch ${D}/home/${KLIPPER_USERNAME}/printer.cfg
    chown -R ${KLIPPER_USERNAME} ${D}/home/${KLIPPER_USERNAME}
}

FILES:${PN} = " \
    /home/${KLIPPER_USERNAME} \
    /home/${KLIPPER_USERNAME}/printer.cfg \
"
