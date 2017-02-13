/*
 * Copyright 2017 Bubblebear Apps Ltd.
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
 */

package uk.co.bubblebearapps.motionaiclient.conversation.model;

import uk.co.bubblebearapps.motionaiclient.CardButton;

/**
 * Created by joefr_000 on 23/01/2017.
 */
public class CardButtonModel {
    private String id;
    private String target;
    private CardButton.ButtonType type;
    private String label;
    private int botColor;


    public CardButtonModel() {
    }

    public String getId() {
        return id;
    }

    public CardButtonModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getTarget() {
        return target;
    }

    public CardButtonModel setTarget(String target) {
        this.target = target;
        return this;
    }

    public CardButton.ButtonType getType() {
        return type;
    }

    public CardButtonModel setType(CardButton.ButtonType type) {
        this.type = type;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public CardButtonModel setLabel(String label) {
        this.label = label;
        return this;
    }

    public void visit(CardButton.Visitor visitor) {

        switch (type) {

            case URL:
                visitor.onVisitUrl(getTarget());
                break;
            case MESSAGE:
                visitor.onVisitMessage(getTarget());
                break;
        }

    }

    public int getBotColor() {
        return botColor;
    }

    public CardButtonModel setButtonColor(int botColor) {
        this.botColor = botColor;
        return this;
    }
}
