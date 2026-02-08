# Copied from:
#     https://github.com/kanavin/meta-cross-toolchain
#
# (And modified a little. The default name (mc...) could imply multi config)

python rickycross_virtclass_handler () {
    cls = e.data.getVar("BBEXTENDCURR")
    variant = e.data.getVar("BBEXTENDVARIANT")
    if cls != "rickycross" or not variant:
        return

    override = ":virtclass-rickycross-" + variant

    e.data.setVar("RICKYCROSS_NAME", variant)
    e.data.setVar("OVERRIDES", e.data.getVar("OVERRIDES", False) + override)
}

addhandler rickycross_virtclass_handler
rickycross_virtclass_handler[eventmask] = "bb.event.RecipePreFinalise"
