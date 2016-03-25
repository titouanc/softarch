FIGURES = $(subst .dia,.eps,$(wildcard *.dia))

Antoine-Carpentier_Titouan-Christophe_2.pdf: main.pdf
	mv $< $@

%.pdf: %.tex report.tex ${FIGURES}
	pdflatex $<
	# bibtex $(subst .tex,,$<)
	# pdflatex $<
	# pdflatex $<

%.eps: %.dia
	dia -e $@ $<

%.tex: %.md
	lunamark -t latex $< | sed -E 's/\\includegraphics(\{.+\})/\\begin{figure}[H]\\includegraphics[width=\\textwidth]\1\\end{figure}/' > $@

clean:
	rm -f *.aux *.log *.out

mrproper: clean
	rm -f *.pdf
