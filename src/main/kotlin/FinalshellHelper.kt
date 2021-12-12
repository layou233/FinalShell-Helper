package com.plaxz

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.event.GlobalEventChannel
import net.mamoe.mirai.event.events.MessageEvent
import net.mamoe.mirai.message.data.MessageSource.Key.quote
import net.mamoe.mirai.message.data.buildMessageChain
import net.mamoe.mirai.utils.info

object FinalshellHelper : KotlinPlugin(
    JvmPluginDescription(
        id = "com.plaxz.finalshell-helper",
        name = "FinalShell-Helper",
        version = "1.0",
    ) {
        author("Launium")
    }
) {
    override fun onEnable() {
        logger.info { "FinalShell-Helper Plugin loaded" }

        GlobalEventChannel.subscribeAlways<MessageEvent> {
            val saying = this.message.contentToString()
            if (saying.startsWith("finalshell")) {
                val hwid = saying.substring(10).replace(" ", "")
                this.subject.sendMessage(buildMessageChain {
                    +this@subscribeAlways.message.quote()
                    +"===FinalShell-Helper===\n"
                    +"高级版激活码："
                    +FinalShellHash.transform("61305${hwid}8552")
                    +"\n专业版激活码："
                    +FinalShellHash.transform("2356${hwid}13593")
                    +"\n优先激活专业版，仅供研究学习使用。"
                    +"\n\nGithub: https://github.com/layou233/FinalShell-Helper"
                })
            }
        }
    }
}