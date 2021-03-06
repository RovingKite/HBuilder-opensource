/**
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package org.python.pydev.django_templates.html.parsing;

import java.util.List;

import org.eclipse.jface.text.rules.IRule;
import org.python.pydev.django_templates.comon.parsing.DjTokenScanner;

import com.aptana.editor.html.parsing.HTMLTokenScanner;

public class DjHTMLTokenScanner extends HTMLTokenScanner {

    DjTokenScanner tokenScanner = new DjTokenScanner();

    public DjHTMLTokenScanner() {
        List<IRule> rules = tokenScanner.getDjRules();

        //Re-add existing rules
        for (IRule rule : fRules) {
            rules.add(rule);
        }

        setRules(rules.toArray(new IRule[rules.size()]));
    }

}
