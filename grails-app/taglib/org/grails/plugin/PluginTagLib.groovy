package org.grails.plugin
/*
 * TODO: This should be replaced either by a partial template or something like BeanFields. (PAL)
 * author: Matthew Taylor
 */
class PluginTagLib {
    static namespace = 'plugin'

    def input = { attrs, body ->
        out << """
            <tr class="prop">
                <td valign="top" class="name">
                    <label for="name">${attrs?.name}</label>
                </td>
                <td class='description'>${attrs?.description}</td>
            </tr>
            <tr class="prop">
                <td></td>
                <td valign="top" class="value ${hasErrors(bean:attrs?.plugin, field:'name','errors')}">
                    ${body()}
                </td>
            </tr>
        """
    }
}
