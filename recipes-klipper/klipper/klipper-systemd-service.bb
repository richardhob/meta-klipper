
LICENSE = "CLOSED"

inherit systemd

include klipper.inc

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "${KLIPPER_SERVICE}"

SRC_URI = "file://${KLIPPER_SERVICE}"
FILES:${PN} += "${systemd_unitdir}/system/${KLIPPER_SERVICE}"

# This is required because the "default" value for S is "UNPACKDIR/BP" which ...
# does not exist. 
#
# When Unpacking, the file is put in the UNPACKDIR by default
S := "${UNPACKDIR}"

do_install:append() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 ${S}/${KLIPPER_SERVICE} ${D}/${systemd_unitdir}/system
}

