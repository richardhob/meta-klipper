# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
#   lib/bossac/LICENSE
#   lib/fatfs/LICENSE.txt
#   lib/hidflash/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464 \
                    file://lib/bossac/LICENSE;md5=bcf9399f7b9b96149837290bcdc3ad39 \
                    file://lib/fatfs/LICENSE.txt;md5=69266499e4f2aac99f067b88a98521a8 \
                    file://lib/hidflash/LICENSE;md5=673b05de02d54440e1fb1fa1f3bb889b \
                    file://lib/kconfiglib/LICENSE.txt;md5=712177a72a3937909543eda3ad1bfb7c"

SRC_URI = "git://github.com/Klipper3d/klipper;protocol=https;branch=master"

# Modify these as desired
PV = "1.0+git"
SRCREV = "48f0b3cad6d4593746384bf49a39913dcb8cc796"

# python3 from meta-python maybe?
# avr-gcc from meta-microcontroller
RDEPENDS:${PN} = "python3 python3-jinja2 python3-markupsafe python3-greenlet python3-pyserial avr-gcc"

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
    :
}

FILES:${PN} += "/klipper/**/*"

do_install () {
	# NOTE: unable to determine what to put here - there is a Makefile but no
	# target named "install", so you will need to define this yourself
    bbplain "${FILES_${PN}}"
    install -d ${D}/klipper/klippy
    cp -r --no-preserve=ownership ${S}/klippy ${D}/klipper
}

