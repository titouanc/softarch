FIGURES = $(subst .dia,.eps,$(wildcard *.dia))

Antoine-Carpentier_Titouan-Christophe_1.pdf: main.pdf
	mv $< $@

%.pdf: %.tex %.bib report.tex ${FIGURES}
	pdflatex $<
	# bibtex $(subst .tex,,$<)
	# pdflatex $<
	# pdflatex $<

%.eps: %.dia
	dia -e $@ $<

%.tex: %.md
	lunamark -t latex $< | sed -E 's/\\includegraphics(\{.+\})/\\begin{figure}[h]\\includegraphics[width=\\textwidth]\1\\end{figure}/' > $@

clean:
	rm -f *.aux *.log report.tex

mrproper: clean
	rm -f *.pdf
