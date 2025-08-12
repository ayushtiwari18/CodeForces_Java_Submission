<h3><a href="https://codeforces.com/contest/1380/problem/A" target="_blank" rel="noopener noreferrer">Three Indices</a></h3>

<div class="header"><div class="title">A. Three Indices</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>You are given a permutation $$$p_1, p_2, \dots, p_n$$$. Recall that sequence of $$$n$$$ integers is called a <span class="tex-font-style-it">permutation</span> if it contains all integers from $$$1$$$ to $$$n$$$ exactly once.</p><p>Find three indices $$$i$$$, $$$j$$$ and $$$k$$$ such that: </p><ul> <li> $$$1 \le i < j < k \le n$$$; </li><li> $$$p_i < p_j$$$ and $$$p_j > p_k$$$. </li></ul> Or say that there are no such indices.</div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains a single integer $$$T$$$ ($$$1 \le T \le 200$$$) — the number of test cases.</p><p>Next $$$2T$$$ lines contain test cases — two lines per test case. The first line of each test case contains the single integer $$$n$$$ ($$$3 \le n \le 1000$$$) — the length of the permutation $$$p$$$.</p><p>The second line contains $$$n$$$ integers $$$p_1, p_2, \dots, p_n$$$ ($$$1 \le p_i \le n$$$; $$$p_i \neq p_j$$$ if $$$i \neq j$$$) — the permutation $$$p$$$.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case: </p><ul> <li> if there are such indices $$$i$$$, $$$j$$$ and $$$k$$$, print <span class="tex-font-style-tt">YES</span> (case insensitive) and the indices themselves; </li><li> if there are no such indices, print <span class="tex-font-style-tt">NO</span> (case insensitive). </li></ul><p>If there are multiple valid triples of indices, print any of them.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0015542204728040443" id="id002827880589333146" class="input-output-copier">Copy</div></div><pre id="id0015542204728040443">3
4
2 1 4 3
6
4 6 1 2 5 3
5
5 3 1 2 4
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0005709259267467892" id="id004566241736104324" class="input-output-copier">Copy</div></div><pre id="id0005709259267467892">YES
2 3 4
YES
3 5 6
NO
</pre></div></div></div>