/*
 * Copyright [2016] [zhangsong <songm.cn>].
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package songm.im;

/**
 * 聊天即时消息服务接口
 *
 * @author  zhangsong
 * @since   0.1, 2016-8-2
 * @version 0.1
 * 
 */
public interface IMServer {

    /**
     * 开启服务
     * @throws IMException
     */
    void start() throws IMException;

    /**
     * 重启服务
     * @throws IMException
     */
    void restart() throws IMException;

    /**
     * 关闭服务
     */
    void shutdown();
    
    /**
     * 服务是否正在运行
     * @return
     */
    public boolean isRunning();
}
