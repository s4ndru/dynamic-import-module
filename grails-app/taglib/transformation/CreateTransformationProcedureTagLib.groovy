package transformation

class CreateTransformationProcedureTagLib {
    static namespace="dim"

    def CreateTransformationProcedure = {
        out << g.javascript(library: "jquery", plugin: "jquery")
        out << g.render(template: "/transformation/createTransformationProcedure", plugin: "dynamic-import-module", params: params)
    }
}
